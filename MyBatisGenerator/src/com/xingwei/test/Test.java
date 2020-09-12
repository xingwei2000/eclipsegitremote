package com.xingwei.test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Test {
	public static void main(String[] args) throws InvalidConfigurationException, IOException, XMLParserException, SQLException, InterruptedException {
		
		File file = new File("src/generator.xml");  //�����ļ�
		List<String> warnings = new ArrayList<String>();  //������Ϣ
		
		ConfigurationParser cp = new ConfigurationParser(warnings);
		
		Configuration config = cp.parseConfiguration(file);
		
		DefaultShellCallback callBack = new DefaultShellCallback(true);
		//���򹤳̵ĺ�����
		MyBatisGenerator generator = new MyBatisGenerator(config,callBack,warnings);
		generator.generate(null);
	}

}
