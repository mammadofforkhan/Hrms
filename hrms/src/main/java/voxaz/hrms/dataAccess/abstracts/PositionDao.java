package voxaz.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import voxaz.hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position, Integer> {

}
