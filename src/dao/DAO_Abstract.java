/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u46323667819
 */
public abstract class DAO_Abstract {
    public abstract void insert(Object object);
    public abstract void update(Object object);
    public abstract void delete(Object object);
    public abstract Object list(int id);
    public abstract ArrayList listAll();
    
}
