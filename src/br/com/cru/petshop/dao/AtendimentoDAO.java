package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IAtendimentoDAO;
import br.com.cru.petshop.models.Animal;
import br.com.cru.petshop.models.Atendimento;
import br.com.cru.petshop.models.Cliente;
import br.com.cru.petshop.models.Situacao;
import br.com.cru.petshop.models.Usuario;
import br.com.cru.petshop.models.enums.LocalizaoEnum;
import br.com.cru.petshop.utils.DBUtils;
import br.com.cru.petshop.utils.DataUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AtendimentoDAO implements IAtendimentoDAO {

    private Connection mConnection = null;

    @Override
    public Atendimento findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        ResultSet resultSet;

        try {
            String sql = "SELECT\n"
                    + "	atendimento.id_atendimento,\n"
                    + "	atendimento.data_entrada,\n"
                    + "	atendimento.data_previsao,\n"
                    + "	atendimento.localizacao,\n"
                    + "	atendimento.idade,\n"
                    + "	atendimento.retorno,\n"
                    + "	atendimento.ambulancia,\n"
                    + "	atendimento.obs,\n"
                    + "	atendimento.fk_cliente,\n"
                    + "	atendimento.fk_animal,\n"
                    + "	atendimento.fk_usuario,\n"
                    + "	atendimento.fk_situacao,\n"
                    + "	cliente.nome,\n"
                    + "	cliente.documento,\n"
                    + "	animal.raca,\n"
                    + "	animal.apelido,\n"
                    + "	animal.nascimento,\n"
                    + "	usuario.nome,\n"
                    + "	situacao.descricao\n"
                    + "FROM atendimento \n"
                    + "INNER JOIN cliente on atendimento.fk_cliente = cliente.id_cliente\n"
                    + "INNER JOIN animal on atendimento.fk_animal = animal.id_animal\n"
                    + "INNER JOIN usuario on atendimento.fk_usuario = usuario.id_usuario\n"
                    + "INNER JOIN situacao on atendimento.fk_situacao = situacao.id_situacao "
                    + "WHERE id_atendimento = ?";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, id);

            resultSet = statement.executeQuery();
            Atendimento atendimento = null;
            while (resultSet.next()) {
                atendimento = new Atendimento(
                        resultSet.getInt("id_atendimento"),
                        resultSet.getDate("data_entrada"),
                        resultSet.getDate("data_previsao"),
                        LocalizaoEnum.get(resultSet.getString("localizacao")),
                        resultSet.getString("idade"),
                        resultSet.getBoolean("retorno"),
                        resultSet.getBoolean("ambulancia"),
                        resultSet.getString("obs"),
                        new Cliente(
                                resultSet.getInt("fk_cliente"),
                                resultSet.getString("nome"),
                                resultSet.getString("documento")
                        ),
                        new Animal(
                                resultSet.getInt("fk_animal"),
                                resultSet.getString("raca"),
                                resultSet.getString("apelido"),
                                resultSet.getDate("nascimento")
                        ),
                        new Usuario(
                                UUID.fromString(resultSet.getString("fk_usuario")),
                                resultSet.getString("nome")
                        ),
                        new Situacao(
                                resultSet.getInt("fk_situacao"),
                                resultSet.getString("descricao")
                        )
                );
            }
            return atendimento;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public Atendimento insert(Atendimento model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO atendimento "
                    + "(DATA_ENTRADA, DATA_PREVISAO, LOCALIZACAO, IDADE, RETORNO, AMBULANCIA, OBS, FK_CLIENTE, FK_ANIMAL, FK_USUARIO, FK_SITUACAO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            statement.setDate(1, DataUtils.convertDate(model.getDataEntrega()));
            statement.setDate(2, DataUtils.convertDate(model.getDataPrevisao()));
            statement.setString(3, LocalizaoEnum.get(model.getLocalizao()));
            statement.setString(4, model.getIdade());
            statement.setBoolean(5, model.isRetorno());
            statement.setBoolean(6, model.isAmbulancia());
            statement.setString(7, model.getObs());
            statement.setInt(8, model.getCliente().getIdCliente());
            statement.setInt(9, model.getAnimal().getId());
            statement.setObject(10, model.getUsuario().getIdUsuario());
            statement.setInt(11, model.getSituacao().getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating atendimento failed, no rows affected.");
            }

            ResultSet generetedKeys = statement.getGeneratedKeys();
            if (generetedKeys.next()) {
                model.setId(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating atendimento failed, no ID obtained.");
            }
            return model;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public void update(Atendimento model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE atendimento "
                    + "DATA_ENTRADA=?, DATA_PREVISAO=?, LOCALIZACAO=?, IDADE=?, RETORNO=?, AMBULANCIA=?, OBS=?, FK_CLIENTE=?, FK_ANIMAL=?, FK_USUARIO=?, FK_SITUACAO=? WHERE ID_ATENDIMENTO = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            statement.setDate(1, DataUtils.convertDate(model.getDataEntrega()));
            statement.setDate(2, DataUtils.convertDate(model.getDataPrevisao()));
            statement.setString(3, LocalizaoEnum.get(model.getLocalizao()));
            statement.setString(4, model.getIdade());
            statement.setBoolean(5, model.isRetorno());
            statement.setBoolean(6, model.isAmbulancia());
            statement.setString(7, model.getObs());
            statement.setInt(8, model.getCliente().getIdCliente());
            statement.setInt(9, model.getAnimal().getId());
            statement.setObject(10, model.getUsuario().getIdUsuario());
            statement.setInt(11, model.getSituacao().getId());
            statement.setInt(11, model.getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating atendimento failed, no rows affected.");
            }
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public List<Atendimento> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<Atendimento> all = new ArrayList<>();

        ResultSet resultSet;

        try {
            String sql = "SELECT\n"
                    + "	atendimento.id_atendimento,\n"
                    + "	atendimento.data_entrada,\n"
                    + "	atendimento.data_previsao,\n"
                    + "	atendimento.localizacao,\n"
                    + "	atendimento.idade,\n"
                    + "	atendimento.retorno,\n"
                    + "	atendimento.ambulancia,\n"
                    + "	atendimento.obs,\n"
                    + "	atendimento.fk_cliente,\n"
                    + "	atendimento.fk_animal,\n"
                    + "	atendimento.fk_usuario,\n"
                    + "	atendimento.fk_situacao,\n"
                    + "	cliente.nome,\n"
                    + "	cliente.documento,\n"
                    + "	animal.raca,\n"
                    + "	animal.apelido,\n"
                    + "	animal.nascimento,\n"
                    + "	usuario.nome,\n"
                    + "	situacao.descricao\n"
                    + "FROM atendimento \n"
                    + "INNER JOIN cliente on atendimento.fk_cliente = cliente.id_cliente\n"
                    + "INNER JOIN animal on atendimento.fk_animal = animal.id_animal\n"
                    + "INNER JOIN usuario on atendimento.fk_usuario = usuario.id_usuario\n"
                    + "INNER JOIN situacao on atendimento.fk_situacao = situacao.id_situacao";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                all.add(new Atendimento(
                        resultSet.getInt("id_atendimento"),
                        resultSet.getDate("data_entrada"),
                        resultSet.getDate("data_previsao"),
                        LocalizaoEnum.get(resultSet.getString("localizacao")),
                        resultSet.getString("idade"),
                        resultSet.getBoolean("retorno"),
                        resultSet.getBoolean("ambulancia"),
                        resultSet.getString("obs"),
                        new Cliente(
                                resultSet.getInt("fk_cliente"),
                                resultSet.getString("nome"),
                                resultSet.getString("documento")
                        ),
                        new Animal(
                                resultSet.getInt("fk_animal"),
                                resultSet.getString("raca"),
                                resultSet.getString("apelido"),
                                resultSet.getDate("nascimento")
                        ),
                        new Usuario(
                                UUID.fromString(resultSet.getString("fk_usuario")),
                                resultSet.getString("nome")
                        ),
                        new Situacao(
                                resultSet.getInt("fk_situacao"),
                                resultSet.getString("descricao")
                        )
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
