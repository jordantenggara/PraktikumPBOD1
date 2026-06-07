package jdbc.service;

/**
 * File : MysqlMahasiswaService.java
 * Deskripsi : Class yang berperan menyediakan layanan (service/controller)
 *             program utama dalam mengelola basis data sehingga interaksi
 *             dengan basis data dapat dilakukan secara object oriented
 *             (dengan memanfaatkan model dan DB utility)
 */
import java.util.*;
import java.sql.*;

import jdbc.model.*;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    // atribut
    Connection koneksi = null;
    
    // Constructor
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa(nama) VALUES('" + mhs.getNama() + "')";
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void update(Mahasiswa mhs){
        try {
            String query = "UPDATE mahasiswa SET nama='" + mhs.getNama() + "' WHERE id=" + mhs.getId();
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil update");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void delete(int inid){
        try {
            String query = "DELETE FROM mahasiswa WHERE id=" +inid;
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil update");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public Mahasiswa getById(int inid){
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id=" +inid;
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return mhs;
    }
    public List<Mahasiswa> getAll(){
        List<Mahasiswa> list = new ArrayList<>();
        try{
            String query = "SELECT * FROM mahasiswa";
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while(rs.next()){
                list.add(new Mahasiswa(rs.getInt("id"),rs.getString("nama")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    public void indexReset(){
        try {
            String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean isEmpty(){
        try {
            String query = "SELECT COUNT(*) FROM mahasiswa";
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                return rs.getInt(1) == 0;
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
    public void closeConnection(){
        try {
            if(koneksi != null){
                koneksi.close();
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
