package dev.raf.dao;

import dev.raf.domain.FossilEntyty;

import java.util.List;

interface IDbConnection {
    List<FossilEntyty> getFossilList();
}
