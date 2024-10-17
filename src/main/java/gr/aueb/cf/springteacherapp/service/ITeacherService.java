package gr.aueb.cf.springteacherapp.service;

import gr.aueb.cf.springteacherapp.core.exceptions.EntityAlreadyExistsException;
import gr.aueb.cf.springteacherapp.core.exceptions.EntityInvalidArgumentException;
import gr.aueb.cf.springteacherapp.dto.TeacherInsertDTO;
import gr.aueb.cf.springteacherapp.dto.TeacherReadOnlyDTO;
import gr.aueb.cf.springteacherapp.model.Teacher;
import org.springframework.data.domain.Page;

public interface ITeacherService {
    public Page<TeacherReadOnlyDTO> getPaginatedTeachers(int page, int size);
    Teacher saveTeacher(TeacherInsertDTO dto)
            throws EntityAlreadyExistsException, EntityInvalidArgumentException;
}
