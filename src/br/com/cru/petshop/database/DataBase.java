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
                "CREATE TABLE IF NOT EXISTS `categoria` (\n"
                + "  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,\n"
                + "  `descricao` varchar(45) NOT NULL UNIQUE,\n"
                + "  PRIMARY KEY (`id_categoria`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `categoria_conta` (\n"
                + "  `id_tipo_conta` int(11) NOT NULL,\n"
                + "  `descricao` varchar(45) NOT NULL UNIQUE,\n"
                + "  PRIMARY KEY (`id_tipo_conta`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

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
                "CREATE TABLE IF NOT EXISTS `foma_pagamento` (\n"
                + "  `id_foma_pagamento` int(11) NOT NULL AUTO_INCREMENT,\n"
                + "  `descricao` varchar(45) NOT NULL UNIQUE,\n"
                + "  PRIMARY KEY (`id_foma_pagamento`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `insumo` (\n"
                + "  `id_insumo` int(11) NOT NULL,\n"
                + "  `nome` varchar(45) DEFAULT NULL,\n"
                + "  `preco_custo` decimal(10,0) DEFAULT NULL,\n"
                + "  `medida` enum('UN','KG','LT') DEFAULT NULL,\n"
                + "  `cod_sistema` varchar(45) NOT NULL UNIQUE,\n"
                + "  `cod_personalizado` varchar(45) NOT NULL UNIQUE,\n"
                + "  PRIMARY KEY (`id_insumo`)\n"
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
                "CREATE TABLE IF NOT EXISTS `fornecedor` (\n"
                + "  `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT,\n"
                + "  `nome` varchar(45) DEFAULT NULL,\n"
                + "  `fone` varchar(45) DEFAULT NULL,\n"
                + "  `email` varchar(45) DEFAULT NULL,\n"
                + "  `documento` varchar(45) NOT NULL UNIQUE,\n"
                + "  `IERG` varchar(45) NOT NULL UNIQUE,\n"
                + "  `fk_endereco` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_fornecedor`),\n"
                + "  FOREIGN KEY (`fk_endereco`) REFERENCES `endereco` (`id_endereco`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `produto` (\n"
                + "  `id_produto` int(11) NOT NULL,\n"
                + "  `nome` varchar(45) DEFAULT NULL,\n"
                + "  `preco_custo` decimal(10,0) DEFAULT NULL,\n"
                + "  `preco_venda` decimal(10,0) DEFAULT NULL,\n"
                + "  `medida` enum('UN','KG','LT') DEFAULT NULL,\n"
                + "  `codigo_pesonalizado` varchar(45) NOT NULL UNIQUE,\n"
                + "  `descricao` varchar(255) DEFAULT NULL,\n"
                + "  `foto` longblob,\n"
                + "  `fk_categoria_conta` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_produto`),\n"
                + "  FOREIGN KEY (`fk_categoria_conta`) REFERENCES `categoria` (`id_categoria`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `estoque` (\n"
                + "  `id_estoque` int(11) NOT NULL,\n"
                + "  `quantidade_atual` mediumtext,\n"
                + "  `valor_custo` decimal(10,0) DEFAULT NULL,\n"
                + "  `fk_produto` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_estoque`),\n"
                + "  FOREIGN KEY (`fk_produto`) REFERENCES `produto` (`id_produto`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `pedido` (\n"
                + "  `id_pedido` int(11) NOT NULL,\n"
                + "  `observacao` varchar(45) DEFAULT NULL,\n"
                + "  `fk_cliente` int(11) NOT NULL,\n"
                + "  `fk_usuario` UUID NOT NULL,\n"
                + "  PRIMARY KEY (`id_pedido`),\n"
                + "  FOREIGN KEY (`fk_cliente`) REFERENCES `cliente` (`id_cliente`),\n"
                + "  FOREIGN KEY (`fk_usuario`) REFERENCES `usuario` (`id_usuario`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `pagamento` (\n"
                + "  `id_pagamento` int(11) NOT NULL,\n"
                + "  `descricao` varchar(45) DEFAULT NULL,\n"
                + "  `data_pagamento` date DEFAULT NULL,\n"
                + "  `fk_foma_pagamento` int(11) NOT NULL,\n"
                + "  `fk_pedido` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_pagamento`,`fk_foma_pagamento`),\n"
                + "  FOREIGN KEY (`fk_foma_pagamento`) REFERENCES `foma_pagamento` (`id_foma_pagamento`),\n"
                + "  FOREIGN KEY (`fk_pedido`) REFERENCES `pedido` (`id_pedido`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `ficha_tecnica` (\n"
                + "  `id_ficha_tecnica` int(11) NOT NULL,\n"
                + "  `insumo_item` varchar(45) DEFAULT NULL,\n"
                + "  `fk_insumo` int(11) NOT NULL,\n"
                + "  `fk_produto` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_ficha_tecnica`),\n"
                + "  FOREIGN KEY (`fk_insumo`) REFERENCES `insumo` (`id_insumo`),\n"
                + "  FOREIGN KEY (`fk_produto`) REFERENCES `produto` (`id_produto`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `item_pedido` (\n"
                + "  `id_item_pedido` int(11) NOT NULL,\n"
                + "  `quantidade` varchar(45) DEFAULT NULL,\n"
                + "  `fk_produto` int(11) NOT NULL,\n"
                + "  `fk_pedido` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_item_pedido`),\n"
                + "  FOREIGN KEY (`fk_produto`) REFERENCES `produto` (`id_produto`),\n"
                + "  FOREIGN KEY (`fk_pedido`) REFERENCES `pedido` (`id_pedido`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `conta_pagar` (\n"
                + "  `id_conta_pagar` int(11) NOT NULL,\n"
                + "  `categoria` varchar(45) DEFAULT NULL,\n"
                + "  `descricao` varchar(255) DEFAULT NULL,\n"
                + "  `vencimento` date DEFAULT NULL,\n"
                + "  `valor` decimal(10,0) DEFAULT NULL,\n"
                + "  `conta_paga` tinyint(1) DEFAULT NULL,\n"
                + "  `data_pagamento` date DEFAULT NULL,\n"
                + "  `valor_pago` decimal(10,0) DEFAULT NULL,\n"
                + "  `fk_fornecedor_id_fornecedor` int(11) NOT NULL,\n"
                + "  `fk_categoria_conta` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_conta_pagar`),\n"
                + "  FOREIGN KEY (`fk_categoria_conta`) REFERENCES `categoria_conta` (`id_tipo_conta`),\n"
                + "  FOREIGN KEY (`fk_fornecedor_id_fornecedor`) REFERENCES `fornecedor` (`id_fornecedor`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `conta_receber` (\n"
                + "  `id_conta_receber` int(11) NOT NULL AUTO_INCREMENT,\n"
                + "  `tipo_conta` varchar(45) DEFAULT NULL,\n"
                + "  `valor` decimal(10,0) DEFAULT NULL,\n"
                + "  `data_credito` date DEFAULT NULL,\n"
                + "  `observacao` varchar(255) DEFAULT NULL,\n"
                + "  `fk_foma_pagamento` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`id_conta_receber`),\n"
                + "  FOREIGN KEY (`fk_foma_pagamento`) REFERENCES `foma_pagamento` (`id_foma_pagamento`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");

        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `situacao` (\n"
                        + " id_situacao int(11) NOT NULL AUTO_INCREMENT,\n"
                        + " descricao varchar(50) NOT NULL UNIQUE,\n"
                        + "PRIMARY KEY (`id_situacao`)\n"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");
        
        tableSQL.add(
                "CREATE TABLE IF NOT EXISTS `pedido_fornecedor` (\n"
                        + " `id_pedido` int(11) NOT NULL AUTO_INCREMENT,\n"
                        + " `previsao` date DEFAULT NULL,\n"
                        + " `descricao` varchar(255) NOT NULL,\n"
                        + " `fk_fornecedor` int(11) NOT NULL,\n"
                        + " `fk_usuario` UUID NOT NULL,\n"
                        + " PRIMARY KEY (`id_pedido`),\n"
                        + " FOREIGN KEY (`fk_fornecedor`) REFERENCES `fornecedor` (`id_fornecedor`),\n"
                        + " FOREIGN KEY (`fk_usuario`) REFERENCES `usuario` (`id_usuario`)\n"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");
               
        return tableSQL;
    }

    private List<String> populator() {

        List<String> list = new ArrayList<>();

        list.add("INSERT INTO tipo_usuario(descricao) VALUES('ADMINISTRADOR')");
        list.add("INSERT INTO tipo_usuario(descricao) VALUES('ATENDENTE')");

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
