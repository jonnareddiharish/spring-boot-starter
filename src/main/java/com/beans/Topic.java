package com.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topic {
	private String id;
	private String name;
	private String desc;
}
