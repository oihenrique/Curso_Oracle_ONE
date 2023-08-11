package br.com.summerbox.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;

	public ConnectionFactory() {
		LoadDbAcessInfo dbAcess = new LoadDbAcessInfo();
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl(dbAcess.getDbUrl());
		comboPooledDataSource.setUser(dbAcess.getDbUser());
		comboPooledDataSource.setPassword(dbAcess.getDbPassword());

		this.dataSource = comboPooledDataSource;
	}

	public Connection recuperarConexao() throws SQLException {
		return this.dataSource.getConnection();
	}
}
