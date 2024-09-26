package com.example.teamcity.api.requests;

import com.example.teamcity.api.models.BaseModel;

public interface CrudInterface {

    Object create(BaseModel model);
    Object read(String Id);
    Object update(String Id, BaseModel model);
    Object delete(String Id);
}
