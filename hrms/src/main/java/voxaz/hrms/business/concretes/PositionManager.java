package voxaz.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import voxaz.hrms.business.abstracts.PositionService;
import voxaz.hrms.dataAccess.abstracts.PositionDao;
import voxaz.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService {
	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<Position> getAll() {
		// TODO Auto-generated method stub
		return this.positionDao.findAll();
	}

}
