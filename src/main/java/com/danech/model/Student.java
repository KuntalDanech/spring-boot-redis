package com.danech.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer stdId;
	private String stdName;
	private Double stdMark;
}
