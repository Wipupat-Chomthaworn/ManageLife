package com.example.appointmentservice.command.rest;

import lombok.Data;

@Data
public class DeleteAppointmentRestModel {
    private String _id;
    private String appointmentId;
    private String userId;
    private String appointmentDetail;
    private String appointmentTime;
}
