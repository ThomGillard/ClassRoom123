package Template.models.form;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class RequestNewForm {

    private LocalDateTime timeSlot;

    private LocalTime duration;

    private String reason;

}