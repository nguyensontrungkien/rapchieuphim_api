package com.example.demo.service;

import java.util.List;

import com.example.demo.model.NguoiDung;


public interface NhanVienService {
	List<NguoiDung> getAllNV();
	NguoiDung findNVByEmailAndPassword(String sdt, String password);
	int insertNV(NguoiDung nv);
	int updateNV(NguoiDung nv);
	int deleteNV(String maNV);
}
