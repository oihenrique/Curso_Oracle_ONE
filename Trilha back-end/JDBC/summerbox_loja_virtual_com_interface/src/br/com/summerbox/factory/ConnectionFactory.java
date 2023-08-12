package br.com.summerbox.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;

	public ConnectionFactory() {
		LoadDbAcessInfo dbAcessInfo = new LoadDbAcessInfo();
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl(dbAcessInfo.getDbUrl());
		comboPooledDataSource.setUser(dbAcessInfo.getDbUser());
		comboPooledDataSource.setPassword(dbAcessInfo.getDbPassword());

		this.dataSource = comboPooledDataSource;
	}

	public Connection recuperarConexao() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
