--------------------------------------------------------
--  File created - Monday-May-27-2019   
--------------------------------------------------------
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_EVALUATIONS with DBMS_METADATA attempting internal generator.
COMMENT ON TABLE MVIEW_EVALUATIONS IS 'This view gives DBA access to summary evaluation output'CREATE VIEW MVIEW_EVALUATIONS
AS
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_EXCEPTIONS with DBMS_METADATA attempting internal generator.
COMMENT ON TABLE MVIEW_EXCEPTIONS IS 'This view gives DBA access to dimension validation results'CREATE VIEW MVIEW_EXCEPTIONS
AS
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_FILTER with DBMS_METADATA attempting internal generator.
COMMENT ON TABLE MVIEW_FILTER IS 'Workload filter records'CREATE VIEW MVIEW_FILTER
AS
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_FILTERINSTANCE with DBMS_METADATA attempting internal generator.
COMMENT ON TABLE MVIEW_FILTERINSTANCE IS 'Workload filter instance records'CREATE VIEW MVIEW_FILTERINSTANCE
AS
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_LOG with DBMS_METADATA attempting internal generator.
COMMENT ON TABLE MVIEW_LOG IS 'Advisor session log'CREATE VIEW MVIEW_LOG
AS
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_RECOMMENDATIONS with DBMS_METADATA attempting internal generator.
COMMENT ON TABLE MVIEW_RECOMMENDATIONS IS 'This view gives DBA access to summary recommendations'CREATE VIEW MVIEW_RECOMMENDATIONS
AS
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_WORKLOAD with DBMS_METADATA attempting internal generator.
COMMENT ON TABLE MVIEW_WORKLOAD IS 'This view gives DBA access to shared workload'CREATE VIEW MVIEW_WORKLOAD
AS
-- Unable to render VIEW DDL for object SYSTEM.PRODUCT_PRIVS with DBMS_METADATA attempting internal generator.
CREATE VIEW PRODUCT_PRIVS
AS
-- Unable to render VIEW DDL for object SYSTEM.SCHEDULER_JOB_ARGS with DBMS_METADATA attempting internal generator.
CREATE VIEW SCHEDULER_JOB_ARGS
AS
-- Unable to render VIEW DDL for object SYSTEM.SCHEDULER_PROGRAM_ARGS with DBMS_METADATA attempting internal generator.
CREATE VIEW SCHEDULER_PROGRAM_ARGS
AS
--------------------------------------------------------
--  DDL for Type LOGMNR$COL_GG_REC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$COL_GG_REC" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$COL_GG_RECS
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$COL_GG_RECS" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$GSBA_GG_REC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$GSBA_GG_REC" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$GSBA_GG_RECS
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$GSBA_GG_RECS" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$KEY_GG_REC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$KEY_GG_REC" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$KEY_GG_RECS
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$KEY_GG_RECS" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$SEQ_GG_REC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$SEQ_GG_REC" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$SEQ_GG_RECS
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$SEQ_GG_RECS" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$TAB_GG_REC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$TAB_GG_REC" 

/
--------------------------------------------------------
--  DDL for Type LOGMNR$TAB_GG_RECS
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TYPE "SYSTEM"."LOGMNR$TAB_GG_RECS" 

/
--------------------------------------------------------
--  DDL for Table BOOKING
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."BOOKING" 
   (	"BOOKID" NUMBER(30,0), 
	"UNIVERSITYID" NUMBER(30,0), 
	"EVENTID" NUMBER, 
	"EVENTSNAME" VARCHAR2(500 BYTE), 
	"CATEGORY" VARCHAR2(300 BYTE), 
	"EVENTDATE" VARCHAR2(20 BYTE), 
	"NOOFSEATS" VARCHAR2(20 BYTE), 
	"BOOKEDDATE" VARCHAR2(20 BYTE), 
	"PRICERATE" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table COURSE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."COURSE" 
   (	"COURSEID" NUMBER(20,0), 
	"COURSENAME" VARCHAR2(100 BYTE), 
	"COURSEFACULTY" VARCHAR2(100 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table ENROLLEDCOURSE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ENROLLEDCOURSE" 
   (	"ENROLLID" NUMBER(20,0), 
	"UNIVERSITYID" NUMBER(20,0), 
	"COURSENAME" VARCHAR2(255 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table EVENTS
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."EVENTS" 
   (	"EVENTID" NUMBER(10,0), 
	"EVENTSNAME" VARCHAR2(255 BYTE), 
	"CATEGORY" VARCHAR2(255 BYTE), 
	"DESCRIPTION" VARCHAR2(500 BYTE), 
	"VENUE" VARCHAR2(255 BYTE), 
	"EVENTDATE" VARCHAR2(255 BYTE), 
	"NOOFSEATS" VARCHAR2(255 BYTE), 
	"PRICERATE" VARCHAR2(100 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SESSIONMANAGEMENT
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."SESSIONMANAGEMENT" 
   (	"SESSIONID" NUMBER(30,0), 
	"UNIVERSITYID" NUMBER(30,0), 
	"LOGIN_DATE" VARCHAR2(100 BYTE), 
	"LOGOUT_DATE" VARCHAR2(100 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table STUDENT
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."STUDENT" 
   (	"UNIVERSITYID" NUMBER(20,0), 
	"STDNAME" VARCHAR2(55 BYTE), 
	"STDEMAIL" VARCHAR2(150 BYTE), 
	"PASSWORD" VARCHAR2(100 BYTE), 
	"ENROLLEDCOURSE" VARCHAR2(255 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Sequence BOOKING_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."BOOKING_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence BOOKING_SEQ1
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."BOOKING_SEQ1"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 341 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence BOOK_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."BOOK_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence COURSE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."COURSE_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ENROLLEDCOURSE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."ENROLLEDCOURSE_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 61 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence EVENTS_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."EVENTS_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence EVENTS_SEQ1
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."EVENTS_SEQ1"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence EVENTS_SEQ2
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."EVENTS_SEQ2"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 81 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence EVENTS_SEQ3
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."EVENTS_SEQ3"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 181 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence LOGMNR_DIDS$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."LOGMNR_DIDS$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence LOGMNR_EVOLVE_SEQ$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."LOGMNR_EVOLVE_SEQ$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence LOGMNR_SEQ$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."LOGMNR_SEQ$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence LOGMNR_UIDS$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."LOGMNR_UIDS$"  MINVALUE 100 MAXVALUE 99999 INCREMENT BY 1 START WITH 100 NOCACHE  ORDER  CYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence MVIEW$_ADVSEQ_GENERIC
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."MVIEW$_ADVSEQ_GENERIC"  MINVALUE 1 MAXVALUE 4294967295 INCREMENT BY 1 START WITH 1 CACHE 50 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence MVIEW$_ADVSEQ_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."MVIEW$_ADVSEQ_ID"  MINVALUE 1 MAXVALUE 4294967295 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ROLLING_EVENT_SEQ$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."ROLLING_EVENT_SEQ$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence SESSIONMANAGEMENT_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."SESSIONMANAGEMENT_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence SESSIONMANAGEMENT_SEQ1
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."SESSIONMANAGEMENT_SEQ1"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 141 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence SESSIONMANAGEMENT_SEQ2
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."SESSIONMANAGEMENT_SEQ2"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 241 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence TABLE1_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."TABLE1_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
REM INSERTING into SYSTEM.BOOKING
SET DEFINE OFF;
Insert into SYSTEM.BOOKING (BOOKID,UNIVERSITYID,EVENTID,EVENTSNAME,CATEGORY,EVENTDATE,NOOFSEATS,BOOKEDDATE,PRICERATE) values (164,172333,2,'Cordova Mobile App Development','Community','4/12/19','1','May 9, 2019','250');
Insert into SYSTEM.BOOKING (BOOKID,UNIVERSITYID,EVENTID,EVENTSNAME,CATEGORY,EVENTDATE,NOOFSEATS,BOOKEDDATE,PRICERATE) values (165,172333,2,'Cordova Mobile App Development','Community','4/12/19','5','May 9, 2019','250');
Insert into SYSTEM.BOOKING (BOOKID,UNIVERSITYID,EVENTID,EVENTSNAME,CATEGORY,EVENTDATE,NOOFSEATS,BOOKEDDATE,PRICERATE) values (321,172333,161,'Kutumba Band Concert','Community','6/6/19','1','2019-05-27','125');
Insert into SYSTEM.BOOKING (BOOKID,UNIVERSITYID,EVENTID,EVENTSNAME,CATEGORY,EVENTDATE,NOOFSEATS,BOOKEDDATE,PRICERATE) values (301,172333,81,'Canteen','Campus','6/7/19','1','2019-05-26','125');
Insert into SYSTEM.BOOKING (BOOKID,UNIVERSITYID,EVENTID,EVENTSNAME,CATEGORY,EVENTDATE,NOOFSEATS,BOOKEDDATE,PRICERATE) values (302,172333,2,'Cordova Mobile App Development','Community','4/12/19','1','2019-05-26','250');
Insert into SYSTEM.BOOKING (BOOKID,UNIVERSITYID,EVENTID,EVENTSNAME,CATEGORY,EVENTDATE,NOOFSEATS,BOOKEDDATE,PRICERATE) values (168,172333,2,'Cordova Mobile App Development','Community','4/12/19','3','May 9, 2019','250');
Insert into SYSTEM.BOOKING (BOOKID,UNIVERSITYID,EVENTID,EVENTSNAME,CATEGORY,EVENTDATE,NOOFSEATS,BOOKEDDATE,PRICERATE) values (281,172333,1,'Python Programming','Campus','5/18/19','1','2019-05-24','125');
REM INSERTING into SYSTEM.COURSE
SET DEFINE OFF;
Insert into SYSTEM.COURSE (COURSEID,COURSENAME,COURSEFACULTY) values (21,'Bsc(hons) Robotic Engineering','Ajaya Lama');
Insert into SYSTEM.COURSE (COURSEID,COURSENAME,COURSEFACULTY) values (2,'Bsc (Hons) CS and  SE','Dr Swati Shah');
Insert into SYSTEM.COURSE (COURSEID,COURSENAME,COURSEFACULTY) values (3,'Bsc (Hons) BBA ','Ujwal Mani Sharma');
REM INSERTING into SYSTEM.ENROLLEDCOURSE
SET DEFINE OFF;
Insert into SYSTEM.ENROLLEDCOURSE (ENROLLID,UNIVERSITYID,COURSENAME) values (1,16000,'CS & SE');
Insert into SYSTEM.ENROLLEDCOURSE (ENROLLID,UNIVERSITYID,COURSENAME) values (2,15000,'Bsc (Hons) BBA ');
Insert into SYSTEM.ENROLLEDCOURSE (ENROLLID,UNIVERSITYID,COURSENAME) values (41,18512,'Bsc(hons) Robotic Engineering');
REM INSERTING into SYSTEM.EVENTS
SET DEFINE OFF;
Insert into SYSTEM.EVENTS (EVENTID,EVENTSNAME,CATEGORY,DESCRIPTION,VENUE,EVENTDATE,NOOFSEATS,PRICERATE) values (1,'Python Programming','Campus','Python Programming is the event that is organized for helping modern programmer to learn OOPS.','Patan ','5/18/19','12','125');
Insert into SYSTEM.EVENTS (EVENTID,EVENTSNAME,CATEGORY,DESCRIPTION,VENUE,EVENTDATE,NOOFSEATS,PRICERATE) values (2,'Cordova Mobile App Development','Community','Cordova mobile app development is another big feature of mobile app.','Kathmandu Koteshwor','4/12/19','10','250');
Insert into SYSTEM.EVENTS (EVENTID,EVENTSNAME,CATEGORY,DESCRIPTION,VENUE,EVENTDATE,NOOFSEATS,PRICERATE) values (161,'Kutumba Band Concert','Community','Kutumba Band Concert','Patan','6/6/19','149','125');
Insert into SYSTEM.EVENTS (EVENTID,EVENTSNAME,CATEGORY,DESCRIPTION,VENUE,EVENTDATE,NOOFSEATS,PRICERATE) values (162,'New Year Special','Community','New year eve celebration','Koteshwor','4/23/19','200','500');
Insert into SYSTEM.EVENTS (EVENTID,EVENTSNAME,CATEGORY,DESCRIPTION,VENUE,EVENTDATE,NOOFSEATS,PRICERATE) values (81,'Canteen','Campus','Canteen','Bharatpur','4/23/19','55','125');
Insert into SYSTEM.EVENTS (EVENTID,EVENTSNAME,CATEGORY,DESCRIPTION,VENUE,EVENTDATE,NOOFSEATS,PRICERATE) values (163,'CS conference ','Campus','Computer Science Conference','PCPS patan','6/6/19','200','250');
REM INSERTING into SYSTEM.SESSIONMANAGEMENT
SET DEFINE OFF;
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (184,172333,'2019-05-24 16:39:13','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (201,172333,'2019-05-26 22:41:22','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (202,172333,'2019-05-26 22:43:22','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (203,172333,'2019-05-26 23:27:28','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (204,172333,'2019-05-26 23:27:38','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (205,172333,'2019-05-26 23:27:46','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (206,172333,'2019-05-26 23:28:05','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (207,172333,'2019-05-26 23:29:04','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (221,172333,'2019-05-27 13:41:03','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (222,172333,'2019-05-27 13:49:36','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (223,172333,'2019-05-27 13:59:19','2019-05-27 14:08:11');
Insert into SYSTEM.SESSIONMANAGEMENT (SESSIONID,UNIVERSITYID,LOGIN_DATE,LOGOUT_DATE) values (224,172333,'2019-05-27 14:07:45','2019-05-27 14:08:11');
REM INSERTING into SYSTEM.STUDENT
SET DEFINE OFF;
Insert into SYSTEM.STUDENT (UNIVERSITYID,STDNAME,STDEMAIL,PASSWORD,ENROLLEDCOURSE) values (172333,'Kshitij Bajagain','kshitij.bajagain123@gmail.com','Kshitij123456','Software Engineering');
Insert into SYSTEM.STUDENT (UNIVERSITYID,STDNAME,STDEMAIL,PASSWORD,ENROLLEDCOURSE) values (185000,'Kumod','Kumod@gmail.com','Kumod123456','Bsc(hons) Robotic Engineering');
Insert into SYSTEM.STUDENT (UNIVERSITYID,STDNAME,STDEMAIL,PASSWORD,ENROLLEDCOURSE) values (18512,'Kiran','kiran@gmail.com','Kiran123','Bsc(hons) Robotic Engineering');
Insert into SYSTEM.STUDENT (UNIVERSITYID,STDNAME,STDEMAIL,PASSWORD,ENROLLEDCOURSE) values (1720849,'Lokendra Dangi','pachar.com@gmail.com','18671766','cs and se');
Insert into SYSTEM.STUDENT (UNIVERSITYID,STDNAME,STDEMAIL,PASSWORD,ENROLLEDCOURSE) values (16000,'Nabin Shahu','shahu@gmail.com','Shahu123','CS & SE');
Insert into SYSTEM.STUDENT (UNIVERSITYID,STDNAME,STDEMAIL,PASSWORD,ENROLLEDCOURSE) values (15000,'Ram Bajagain','rame@gmail.com','Ram123','Bsc (Hons) BBA ');
--------------------------------------------------------
--  DDL for Index BOOKING_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."BOOKING_PK" ON "SYSTEM"."BOOKING" ("BOOKID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index COURSE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."COURSE_PK" ON "SYSTEM"."COURSE" ("COURSEID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index ENROLLEDCOURSE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."ENROLLEDCOURSE_PK" ON "SYSTEM"."ENROLLEDCOURSE" ("ENROLLID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index EVENTS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."EVENTS_PK" ON "SYSTEM"."EVENTS" ("EVENTID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SESSIONMANAGEMENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."SESSIONMANAGEMENT_PK" ON "SYSTEM"."SESSIONMANAGEMENT" ("SESSIONID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007562
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."SYS_C007562" ON "SYSTEM"."STUDENT" ("UNIVERSITYID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index STDEMAIL_UQ
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."STDEMAIL_UQ" ON "SYSTEM"."STUDENT" ("STDEMAIL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PASSWORD_UQ
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."PASSWORD_UQ" ON "SYSTEM"."STUDENT" ("PASSWORD") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Trigger BOOKING_TRG
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."BOOKING_TRG" 
BEFORE INSERT ON BOOKING 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.BOOKID IS NULL THEN
      SELECT BOOKING_SEQ1.NEXTVAL INTO :NEW.BOOKID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."BOOKING_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger COURSE_TRG
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."COURSE_TRG" 
BEFORE INSERT ON COURSE 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.COURSEID IS NULL THEN
      SELECT COURSE_SEQ.NEXTVAL INTO :NEW.COURSEID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."COURSE_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger ENROLLEDCOURSE_TRG
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."ENROLLEDCOURSE_TRG" 
BEFORE INSERT ON ENROLLEDCOURSE 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ENROLLID IS NULL THEN
      SELECT ENROLLEDCOURSE_SEQ.NEXTVAL INTO :NEW.ENROLLID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."ENROLLEDCOURSE_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger EVENTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."EVENTS_TRG" 
BEFORE INSERT ON EVENTS 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    NULL;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."EVENTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger EVENTS_TRG1
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."EVENTS_TRG1" 
BEFORE INSERT ON EVENTS 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.EVENTID IS NULL THEN
      SELECT EVENTS_SEQ3.NEXTVAL INTO :NEW.EVENTID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."EVENTS_TRG1" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SESSIONMANAGEMENT_TRG
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."SESSIONMANAGEMENT_TRG" 
BEFORE INSERT ON SESSIONMANAGEMENT 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    NULL;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."SESSIONMANAGEMENT_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SESSIONMANAGEMENT_TRG1
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."SESSIONMANAGEMENT_TRG1" 
BEFORE INSERT ON SESSIONMANAGEMENT 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    NULL;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."SESSIONMANAGEMENT_TRG1" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SESSIONMANAGEMENT_TRG2
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."SESSIONMANAGEMENT_TRG2" 
BEFORE INSERT ON SESSIONMANAGEMENT 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.SESSIONID IS NULL THEN
      SELECT SESSIONMANAGEMENT_SEQ2.NEXTVAL INTO :NEW.SESSIONID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."SESSIONMANAGEMENT_TRG2" ENABLE;
--------------------------------------------------------
--  DDL for Function LOGMNR$COL_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$COL_GG_TABF_PUBLIC" 

/
--------------------------------------------------------
--  DDL for Function LOGMNR$GSBA_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$GSBA_GG_TABF_PUBLIC" 

/
--------------------------------------------------------
--  DDL for Function LOGMNR$KEY_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$KEY_GG_TABF_PUBLIC" 

/
--------------------------------------------------------
--  DDL for Function LOGMNR$SEQ_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$SEQ_GG_TABF_PUBLIC" 

/
--------------------------------------------------------
--  DDL for Function LOGMNR$TAB_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$TAB_GG_TABF_PUBLIC" 

/
-- Unable to render SYNONYM DDL for object SYSTEM.CATALOG with DBMS_METADATA attempting internal generator.
CREATE SYNONYM CATALOG FOR SYS.CATALOG
-- Unable to render SYNONYM DDL for object SYSTEM.COL with DBMS_METADATA attempting internal generator.
CREATE SYNONYM COL FOR SYS.COL
-- Unable to render SYNONYM DDL for object SYSTEM.PRODUCT_USER_PROFILE with DBMS_METADATA attempting internal generator.
CREATE SYNONYM PRODUCT_USER_PROFILE FOR SQLPLUS_PRODUCT_PROFILE
-- Unable to render SYNONYM DDL for object SYSTEM.PUBLICSYN with DBMS_METADATA attempting internal generator.
CREATE SYNONYM PUBLICSYN FOR SYS.PUBLICSYN
-- Unable to render SYNONYM DDL for object SYSTEM.SYSCATALOG with DBMS_METADATA attempting internal generator.
CREATE SYNONYM SYSCATALOG FOR SYS.SYSCATALOG
-- Unable to render SYNONYM DDL for object SYSTEM.SYSFILES with DBMS_METADATA attempting internal generator.
CREATE SYNONYM SYSFILES FOR SYS.SYSFILES
-- Unable to render SYNONYM DDL for object SYSTEM.TAB with DBMS_METADATA attempting internal generator.
CREATE SYNONYM TAB FOR SYS.TAB
-- Unable to render SYNONYM DDL for object SYSTEM.TABQUOTAS with DBMS_METADATA attempting internal generator.
CREATE SYNONYM TABQUOTAS FOR SYS.TABQUOTAS
--------------------------------------------------------
--  Constraints for Table BOOKING
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."BOOKING" MODIFY ("BOOKID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."BOOKING" MODIFY ("UNIVERSITYID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."BOOKING" MODIFY ("EVENTID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."BOOKING" MODIFY ("EVENTSNAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."BOOKING" MODIFY ("CATEGORY" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."BOOKING" MODIFY ("EVENTDATE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."BOOKING" MODIFY ("NOOFSEATS" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."BOOKING" MODIFY ("BOOKEDDATE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."BOOKING" ADD CONSTRAINT "BOOKING_PK" PRIMARY KEY ("BOOKID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table COURSE
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."COURSE" MODIFY ("COURSEID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."COURSE" MODIFY ("COURSENAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."COURSE" MODIFY ("COURSEFACULTY" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."COURSE" ADD CONSTRAINT "COURSE_PK" PRIMARY KEY ("COURSEID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ENROLLEDCOURSE
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."ENROLLEDCOURSE" MODIFY ("ENROLLID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ENROLLEDCOURSE" MODIFY ("UNIVERSITYID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ENROLLEDCOURSE" ADD CONSTRAINT "ENROLLEDCOURSE_PK" PRIMARY KEY ("ENROLLID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."ENROLLEDCOURSE" MODIFY ("COURSENAME" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table EVENTS
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."EVENTS" MODIFY ("EVENTID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTS" MODIFY ("EVENTSNAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTS" MODIFY ("CATEGORY" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTS" MODIFY ("DESCRIPTION" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTS" MODIFY ("EVENTDATE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTS" MODIFY ("NOOFSEATS" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTS" ADD CONSTRAINT "EVENTS_PK" PRIMARY KEY ("EVENTID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."EVENTS" MODIFY ("VENUE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table SESSIONMANAGEMENT
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."SESSIONMANAGEMENT" MODIFY ("SESSIONID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."SESSIONMANAGEMENT" MODIFY ("UNIVERSITYID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."SESSIONMANAGEMENT" ADD CONSTRAINT "SESSIONMANAGEMENT_PK" PRIMARY KEY ("SESSIONID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table STUDENT
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."STUDENT" MODIFY ("UNIVERSITYID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENT" MODIFY ("STDNAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENT" MODIFY ("STDEMAIL" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENT" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENT" MODIFY ("ENROLLEDCOURSE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENT" ADD PRIMARY KEY ("UNIVERSITYID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."STUDENT" ADD CONSTRAINT "STDEMAIL_UQ" UNIQUE ("STDEMAIL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."STUDENT" ADD CONSTRAINT "PASSWORD_UQ" UNIQUE ("PASSWORD")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table BOOKING
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."BOOKING" ADD CONSTRAINT "BOOKING_FK2" FOREIGN KEY ("UNIVERSITYID")
	  REFERENCES "SYSTEM"."STUDENT" ("UNIVERSITYID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ENROLLEDCOURSE
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."ENROLLEDCOURSE" ADD CONSTRAINT "ENROLLEDCOURSE_FK1" FOREIGN KEY ("UNIVERSITYID")
	  REFERENCES "SYSTEM"."STUDENT" ("UNIVERSITYID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SESSIONMANAGEMENT
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."SESSIONMANAGEMENT" ADD CONSTRAINT "SESSIONMANAGEMENT_FK1" FOREIGN KEY ("UNIVERSITYID")
	  REFERENCES "SYSTEM"."STUDENT" ("UNIVERSITYID") ENABLE;