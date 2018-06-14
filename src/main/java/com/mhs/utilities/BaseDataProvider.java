package com.mhs.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.json.JSONObject;
import org.json.JSONTokener;

public class BaseDataProvider {
    public static JSONObject[] getTestData(Class className ,String...files) {

        List<JSONObject> jsonList = new ArrayList<>();

        for (String fileName : files){
            try {
                FileReader file = new FileReader(className.getResource(fileName).getFile());
                JSONTokener jsonData = new JSONTokener(file);
                JSONObject jsonObj = new JSONObject(jsonData);
                jsonList.add(jsonObj);
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }

        return jsonList.toArray(new JSONObject[jsonList.size()]);
    }

}
