package gr.aueb.cf.springteacherapp.service;

import gr.aueb.cf.springteacherapp.model.static_data.Region;

import java.util.List;

public interface IRegionService {
    List< Region> findAllRegions();
}
