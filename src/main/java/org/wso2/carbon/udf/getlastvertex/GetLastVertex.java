package org.wso2.carbon.udf.getlastvertex;

/**
 * Created by wso2 on 16/1/17.
 */
public class GetLastVertex {

    public String getVertexAtLast(String pattern){

        String[] parts = pattern.split("-");
        return parts[parts.length-1];
    }
}
