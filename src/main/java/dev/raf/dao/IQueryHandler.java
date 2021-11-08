package dev.raf.dao;

import dev.raf.dao.dto.FossilDto;

import java.util.List;

public interface IQueryHandler {
    List<FossilDto> getAllEntries();
    List<FossilDto> getAllEntriesSortedBy(String header);
    FossilDto getElementById(int id);
}
