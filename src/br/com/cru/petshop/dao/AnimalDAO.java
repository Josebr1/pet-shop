package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IAnimalDAO;
import br.com.cru.petshop.models.Animal;
import br.com.cru.petshop.models.Cliente;
import br.com.cru.petshop.models.Endereco;
import br.com.cru.petshop.models.Especie;
import br.com.cru.petshop.models.enums.Sexo;
import br.com.cru.petshop.models.enums.SexoAnimal;
import br.com.cru.petshop.utils.DBUtils;
import br.com.cru.petshop.utils.DataUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO implements IAnimalDAO {

    private Connection mConnection = null;

    @Override
    public Animal findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM animal \n"
                    + "INNER JOIN cliente on animal.fk_cliente = cliente.id_cliente\n"
                    + "INNER JOIN especie on animal.fk_especie = especie.id_especie WHERE id_animal = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, id);

            resultSet = statement.executeQuery();
            Animal a = null;
            
            while (resultSet.next()) {
                a = new Animal(
                        resultSet.getInt("ID_ANIMAL"),
                        resultSet.getString("COR"),
                        resultSet.getString("RACA"),
                        resultSet.getString("APELIDO"),
                        resultSet.getDate("NASCIMENTO"),
                        SexoAnimal.get(resultSet.getString("SEXO")),
                        resultSet.getString("PORTE"),
                        resultSet.getString("OBS"),
                        new Cliente(
                                resultSet.getInt("ID_CLIENTE"),
                                resultSet.getString("NOME"),
                                resultSet.getString("DOCUMENTO"),
                                resultSet.getString("EMAIL"),
                                resultSet.getDate("DATA_NASCIEMENTO"),
                                Sexo.get(resultSet.getString("SEXO")),
                                resultSet.getString("FONE"),
                                new Endereco(resultSet.getInt("FK_ENDERECO"))
                        ),
                        new Especie(resultSet.getInt("ID_ESPECIE"), resultSet.getString("DESCRICAO"))
                );
            }
            return a;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public Animal insert(Animal model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO animal (COR, RACA, APELIDO, NASCIMENTO, SEXO, PORTE, OBS, FK_CLIENTE, FK_ESPECIE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            statement.setString(1, model.getCor());
            statement.setString(2, model.getRaca());
            statement.setString(3, model.getApelido());
            statement.setDate(4, DataUtils.convertDate(model.getNascimento()));
            statement.setString(5, SexoAnimal.get(model.getSexo()));
            statement.setString(6, model.getPorte());
            statement.setString(7, model.getObs());
            statement.setInt(8, model.getCliente().getIdCliente());
            statement.setInt(9, model.getEspecie().getIdEspecie());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating Animal failed, no rows affected.");
            }

            ResultSet generetedKeys = statement.getGeneratedKeys();
            if (generetedKeys.next()) {
                model.setId(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating Animal failed, no ID obtained.");
            }
            return model;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public void update(Animal model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE animal SET COR=?, RACA=?, APELIDO=?, NASCIMENTO=?, SEXO=?, PORTE=?, OBS=?, FK_CLIENTE=?, FK_ESPECIE=? WHERE ID_ANIMAL = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            statement.setString(1, model.getCor());
            statement.setString(2, model.getRaca());
            statement.setString(3, model.getApelido());
            statement.setDate(4, DataUtils.convertDate(model.getNascimento()));
            statement.setString(5, SexoAnimal.get(model.getSexo()));
            statement.setString(6, model.getPorte());
            statement.setString(7, model.getObs());
            statement.setInt(8, model.getCliente().getIdCliente());
            statement.setInt(9, model.getEspecie().getIdEspecie());
            statement.setInt(10, model.getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating Animal failed, no rows affected.");
            }
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public List<Animal> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        mConnection = DBUtils.getConnection();
        List<Animal> all = new ArrayList<>();

        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM animal \n"
                    + "INNER JOIN cliente on animal.fk_cliente = cliente.id_cliente\n"
                    + "INNER JOIN especie on animal.fk_especie = especie.id_especie";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                all.add(new Animal(
                        resultSet.getInt("ID_ANIMAL"),
                        resultSet.getString("COR"),
                        resultSet.getString("RACA"),
                        resultSet.getString("APELIDO"),
                        resultSet.getDate("NASCIMENTO"),
                        SexoAnimal.get(resultSet.getString("SEXO")),
                        resultSet.getString("PORTE"),
                        resultSet.getString("OBS"),
                        new Cliente(
                                resultSet.getInt("ID_CLIENTE"),
                                resultSet.getString("NOME"),
                                resultSet.getString("DOCUMENTO"),
                                resultSet.getString("EMAIL"),
                                resultSet.getDate("DATA_NASCIEMENTO"),
                                Sexo.get(resultSet.getString("SEXO")),
                                resultSet.getString("FONE"),
                                new Endereco(resultSet.getInt("FK_ENDERECO"))
                        ),
                        new Especie(resultSet.getInt("ID_ESPECIE"), resultSet.getString("DESCRICAO"))
                ));
            }
            return all;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

}
