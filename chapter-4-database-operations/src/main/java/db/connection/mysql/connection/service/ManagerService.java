package db.connection.mysql.connection.service;

import java.util.Collection;
import java.util.List;

import db.connection.mysql.connection.dao.ManagerDAO;
import db.connection.mysql.connection.model.Manager;

public class ManagerService<Manager> {

	private ManagerDAO managerDAO;
	
	public ManagerService(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}
	
	// buraya aktif yöneticileri listeleyen bir fonksiyon yazınız.
	
	@SuppressWarnings("unchecked")
	public List<Manager> listAllActiveManagers() {

		return (List<Manager>) this.managerDAO.loadAllActiveManagers();
	}
}
