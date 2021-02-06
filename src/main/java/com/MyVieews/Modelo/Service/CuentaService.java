package com.MyVieews.Modelo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.MyVieews.Modelo.Entidades.Cuenta;
import com.MyVieews.Modelo.Entidades.Persona;
import com.MyVieews.Modelo.Repository.CuentaRepository;
import com.MyVieews.Modelo.Repository.PersonaRepository;

@Service // esto sirve para que la clase se identifique como servicio
public class CuentaService implements CuentaRepository {// agregamos una implementacion del repositorio( implements
														// "nombre del repositorio"
	// creamos un atributo del repositorio
	@Autowired // permite crear una inyeccion sin necesidad de crear una instancia del atributo
	private CuentaRepository cuentaRepository;

	@Override
	public List<Cuenta> findAll() {
		return cuentaRepository.findAll();
	}

	@Override
	public List<Cuenta> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cuenta> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Cuenta> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Cuenta> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Cuenta getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cuenta> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> S save(S entity) {
		return cuentaRepository.save(entity);
	}

	@Override
	public Optional<Cuenta> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Cuenta entity) {
		cuentaRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Cuenta> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Cuenta> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Cuenta> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
