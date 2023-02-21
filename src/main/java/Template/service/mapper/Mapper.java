package Template.service.mapper;

import Template.models.dto.ClassroomDTO;
import Template.models.entity.ClassRoom;
import Template.models.form.Form;
import org.springframework.stereotype.Service;

@Service
public class Mapper {

    public ClassroomDTO toDto(ClassRoom classRoom){

        if (classRoom == null){
            return null;
        }else {
            return ClassroomDTO.builder()
                    .id(classRoom.getId())
                    .build();
        }
    }

    public ClassRoom formToEntity(Form form ) {
        if ( form == null ){
            return null;
        }else{
            ClassRoom classRoom = new ClassRoom();
            return classRoom;
        }
    }
}
