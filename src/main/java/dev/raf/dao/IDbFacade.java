package dev.raf.dao;

import dev.raf.dao.dto.FossilDto;


public interface IDbFacade {

    void save(FossilDto fossil);
    void delete(int id);
    void update(FossilDto fossilDto);

}
