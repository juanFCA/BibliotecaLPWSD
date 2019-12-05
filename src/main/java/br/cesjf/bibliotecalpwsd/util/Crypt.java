/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.bibliotecalpwsd.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author juan
 */
public class Crypt {
    public static String md5Encryption(String senha) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
        String senhaCrypt = hash.toString(16);
        return senhaCrypt;
    }
}
