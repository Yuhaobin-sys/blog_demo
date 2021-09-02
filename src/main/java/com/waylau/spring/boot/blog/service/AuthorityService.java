package com.waylau.spring.boot.blog.service;

import com.waylau.spring.boot.blog.domain.Authority;


public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param Authority
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
