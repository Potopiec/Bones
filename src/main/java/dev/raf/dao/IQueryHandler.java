package dev.raf.dao;

import dev.raf.dao.dto.FossilQueryDto;

import java.util.List;

interface IQueryHandler {
    List<FossilQueryDto> getAllEntries();
    List<FossilQueryDto> getAllEntriesSortedBy(String header);
}
