/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.utils;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author varogonz
 * @param <E>
 */
public class JsonList<E> extends LinkedList<E>{

    @Override
    public String toString() {
        String out = "[";
        
        for(E e : this){out+=e.toString()+',';}
        
        out=out.substring(0,out.length()-1)+']';
        
        return out;
    }
    
    public String toJson(List<E> l) {
        String out = "[";
        
        for(E e : l){out+=e.toString()+',';}
        
        out=out.substring(0,out.length()-1)+']';
        
        return out;
    }
    
}
