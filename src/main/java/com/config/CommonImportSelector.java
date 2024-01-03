package com.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class CommonImportSelector implements ImportSelector {
  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    // return new String[] { "com.config.CommonConfig" };

    // 读取配置文件
    List<String> imports = new ArrayList<>();
    InputStream inputStream = CommonImportSelector.class.getClassLoader().getResourceAsStream("common.imports");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
    String line = null;
    try {
      while ((line = bufferedReader.readLine()) != null) {
        imports.add(line);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      bufferedReader.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return imports.toArray(new String[0]);
  }
}
