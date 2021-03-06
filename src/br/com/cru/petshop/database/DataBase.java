package br.com.cru.petshop.database;

import br.com.cru.petshop.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {

    private Connection mConnection = null;

    public DataBase() {
    }

    private List<String> initializeTables() {
        List<String> tableSQL = new ArrayList<>();

        //tableSQL.add("drop all objects delete files");
        
        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `tipo_usuario` (\n"
                + "  `id_tipo_usuario` int(11) NOT NULL AUTO_INCREMENT,\n"
                + "  `descricao` varchar(45) NOT NULL UNIQUE,\n"
                + "  PRIMARY KEY (`id_tipo_usuario`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `endereco` (\n"
                + "  `id_endereco` int(11) NOT NULL AUTO_INCREMENT,\n"
                + "  `cep` varchar(8) NOT NULL,\n"
                + "  `endereco` varchar(255) NOT NULL,\n"
                + "  `bairro` varchar(150) NOT NULL,\n"
                + "  `cidade` varchar(150) NOT NULL,\n"
                + "  `referencia` varchar(255) DEFAULT NULL,\n"
                + "  `numero` varchar(255) NOT NULL,\n"
                + "  `complemento` varchar(255) DEFAULT NULL,\n"
                + "  `uf` enum('AC', 'AL', 'AP', 'AM', 'BA', 'CE', 'DF', 'ES', 'GO', 'MA', 'MT', 'MS', 'MG', 'PA', 'PB', 'PR', 'PE', 'PI', 'RJ', 'RN', 'RS', 'RO', 'RR', 'SC', 'SP', 'SE', 'TO') NOT NULL,\n"
                + "  PRIMARY KEY (`id_endereco`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `usuario` (\n"
                + "  `id_usuario` UUID NOT NULL,\n"
                + "  `nome` varchar(150) NOT NULL,\n"
                + "  `email` varchar(100) NOT NULL UNIQUE,\n"
                + "  `fone` varchar(11) NOT NULL,\n"
                + "  `tem_acesso_programa` tinyint(4) NOT NULL,\n"
                + "  `login` varchar(45) NOT NULL,\n"
                + "  `senha` longtext NOT NULL,\n"
                + "  `ativo` tinyint(4) NOT NULL,\n"
                + "  `fk_tipo_usuario` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_usuario`),\n"
                + "  FOREIGN KEY (`fk_tipo_usuario`) REFERENCES `tipo_usuario` (`id_tipo_usuario`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `cliente` (\n"
                + "  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,\n"
                + "  `nome` varchar(150) DEFAULT NULL,\n"
                + "  `documento` varchar(14) NOT NULL UNIQUE,\n"
                + "  `email` varchar(45) NOT NULL UNIQUE,\n"
                + "  `data_nasciemento` datetime DEFAULT NULL,\n"
                + "  `sexo` enum('MASCULINO','FEMININO') DEFAULT NULL,\n"
                + "  `fone` varchar(11) DEFAULT NULL,\n"
                + "  `fk_endereco` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_cliente`),\n"
                + "  FOREIGN KEY (`fk_endereco`) REFERENCES `endereco` (`id_endereco`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `especie` (\n"
                    + " `id_especie` int(11) NOT NULL AUTO_INCREMENT,\n"
                    + " `descricao` varchar(255) NOT NULL UNIQUE,\n"
                    + " PRIMARY KEY (`id_especie`)\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");
        
        tableSQL.add("CREATE TABLE IF NOT EXISTS `animal` (\n"
                    + " `id_animal` int(11) NOT NULL AUTO_INCREMENT,\n"
                    + " `cor` varchar(35) NOT NULL,\n"
                    + " `raca` varchar(255) NOT NULL,\n"
                    + " `apelido` varchar(255),\n"
                    + " `nascimento` datetime DEFAULT NULL,\n"
                    + " `sexo` enum('MACHO','FEMEA', 'FEMEA_CASTRADA', 'INDEFINIDO', 'MACHO_CASTRADO') DEFAULT NULL,\n"
                    + " `porte` varchar(35) NOT NULL,\n"
                    + " `obs` varchar(255),\n"
                    + " `fk_cliente` int(11) NOT NULL,\n"
                    + " `fk_especie` int(11) NOT NULL,\n"
                    + " PRIMARY KEY (`id_animal`),\n"
                    + " FOREIGN KEY (`fk_cliente`) REFERENCES `cliente` (`id_cliente`),\n"
                    + " FOREIGN KEY (`fk_especie`) REFERENCES `especie` (`id_especie`)\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");
        
        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `situacao` (\n"
                        + " id_situacao int(11) NOT NULL AUTO_INCREMENT,\n"
                        + " descricao varchar(50) NOT NULL UNIQUE,\n"
                        + "PRIMARY KEY (`id_situacao`)\n"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");
               
        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `atendimento` (\n"
                        + " `id_atendimento` int(11) NOT NULL AUTO_INCREMENT,\n"
                        + " `data_entrada` date DEFAULT NOT NULL,\n"
                        + " `data_previsao` date DEFAULT NOT NULL,\n"
                        + " `localizacao` enum('AREA DE TOSA','AREA DE BANHO','CANIL','NA RESPONSABILIDADE DO CLIENTE','SALA DE ESPERA','NO CONSULTORIO') DEFAULT NULL,\n"
                        + " `idade` varchar(10) NOT NULL,\n"
                        + " `retorno` TINYINT(1),\n"
                        + " `ambulancia` TINYINT(1),\n"
                        + " `obs` VARCHAR(255),\n"
                        + " `fk_cliente` int(11) NOT NULL,\n"
                        + " `fk_animal` int(11) NOT NULL,\n"
                        + " `fk_usuario` UUID NOT NULL,\n"
                        + " `fk_situacao` int(11) NOT NULL,\n"
                        + " PRIMARY KEY(`id_atendimento`),\n"
                        + " FOREIGN KEY (`fk_cliente`) REFERENCES `cliente` (`id_cliente`),\n"
                        + " FOREIGN KEY (`fk_animal`) REFERENCES `animal` (`id_animal`),\n"
                        + " FOREIGN KEY (`fk_usuario`) REFERENCES `usuario` (`id_usuario`),\n"
                        + " FOREIGN KEY (`fk_situacao`) REFERENCES `situacao` (`id_situacao`)\n"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");
        
        return tableSQL;
    }

    private List<String> populator() {

        List<String> list = new ArrayList<>();

        list.add("INSERT INTO tipo_usuario(descricao) VALUES('ADMINISTRADOR')");
        list.add("INSERT INTO tipo_usuario(descricao) VALUES('ATENDENTE')");
        
        list.add("INSERT INTO especie(descricao) VALUES('Cachorro')");
        list.add("INSERT INTO especie(descricao) VALUES('Gato')");
        
        list.add("INSERT INTO situacao(descricao) VALUES('Pronto Para o Dono')");
        list.add("INSERT INTO situacao(descricao) VALUES('Realizando Tosa')");
        list.add("INSERT INTO situacao(descricao) VALUES('Realizando Banho')");
        list.add("INSERT INTO situacao(descricao) VALUES('Aguardando o Dono')");

        return list;
    }

    public void initialize() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalAccessException, SQLException, SQLException {

        try {
            mConnection = DBUtils.getConnection();
            Logger.getLogger(DataBase.class.getName()).log(Level.INFO, "*********** initialize ************\n\n");

            for (String table : initializeTables()) {
                PreparedStatement ps = DBUtils.getPreparedStatement(mConnection, table);
                Logger.getLogger(DataBase.class.getName()).log(Level.INFO, table);
                ps.execute();
            }

            PreparedStatement isTipoUsuario = DBUtils.getPreparedStatement(mConnection, "SELECT * FROM tipo_usuario");

            ResultSet rs = isTipoUsuario.executeQuery();

            if (!rs.next()) {

                for (String sqlQuery : populator()) {
                    PreparedStatement ps = DBUtils.getPreparedStatement(mConnection, sqlQuery);
                    ps.execute();
                }
            }

        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }

    }
}
