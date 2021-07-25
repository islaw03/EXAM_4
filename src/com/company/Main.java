package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends SQL_Connect {

    public static void main(String[] args) {
        /*create table routes(
        id serial primary key,
        start_route varchar(5) not null,
        end_route varchar(5) not null
        );

        create teable buses(
        id serial primary key,
        number_bus int references routes(id)
        );


        create table drivers(
        id serial primary key,
        full_name varchar(50) not null
        );

        create table jurnal(
        id serial primary key,
        driver_id int refernces drivers(id),
        bus_id int references buses(id),
        driving_time timestamp not null
        );
        insert into routes (start_route,end_route)
        values('102','302'),('302','204'),('204','101'),('101',301');


       insert into buses(number_bus,route_id)
       values('BIR111',1),('EKI222',2),('VIP001',3),('AAA123',4);

       insert into drivers (full_name)
       values('Asan Usonov'),('Dominik Toretto'),('Uson Asanov')('Kalmurzaev Uluk);

       inser into jurnal (driver_id,bus_id,driving_time)
       values(1,1, now()+ '20:00'),(2,1,now()+'24:00,),(3,2,now()+'32:00'),(4,2now()+'48:00');











         */


    }
}
