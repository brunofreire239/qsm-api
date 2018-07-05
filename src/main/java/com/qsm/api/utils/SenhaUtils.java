//package com.qsm.api.utils;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//public class SenhaUtils {
//
//	public static String gerarBcrypt(String senha) {
//		if (senha == null) {
//			return senha;
//		}
//
//		BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
//		return bcryptEncoder.encode(senha);
//	}
//	
//	
//	public static boolean senhaValida(String senha, String senhaEncoded) {
//		BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
//		return bcryptEncoder.matches(senha, senhaEncoded);
//	}
//	
//
//}
