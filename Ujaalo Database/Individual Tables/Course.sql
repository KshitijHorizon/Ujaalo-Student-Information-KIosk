--------------------------------------------------------
--  File created - Monday-May-27-2019   
--------------------------------------------------------
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_EVALUATIONS with DBMS_METADATA attempting internal generator.
CREATE VIEW MVIEW_EVALUATIONS
ASCOMMENT ON TABLE MVIEW_EVALUATIONS IS 'This view gives DBA access to summary evaluation output'
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_EXCEPTIONS with DBMS_METADATA attempting internal generator.
CREATE VIEW MVIEW_EXCEPTIONS
ASCOMMENT ON TABLE MVIEW_EXCEPTIONS IS 'This view gives DBA access to dimension validation results'
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_FILTER with DBMS_METADATA attempting internal generator.
CREATE VIEW MVIEW_FILTER
ASCOMMENT ON TABLE MVIEW_FILTER IS 'Workload filter records'
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_FILTERINSTANCE with DBMS_METADATA attempting internal generator.
CREATE VIEW MVIEW_FILTERINSTANCE
ASCOMMENT ON TABLE MVIEW_FILTERINSTANCE IS 'Workload filter instance records'
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_LOG with DBMS_METADATA attempting internal generator.
CREATE VIEW MVIEW_LOG
ASCOMMENT ON TABLE MVIEW_LOG IS 'Advisor session log'
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_RECOMMENDATIONS with DBMS_METADATA attempting internal generator.
CREATE VIEW MVIEW_RECOMMENDATIONS
ASCOMMENT ON TABLE MVIEW_RECOMMENDATIONS IS 'This view gives DBA access to summary recommendations'
-- Unable to render VIEW DDL for object SYSTEM.MVIEW_WORKLOAD with DBMS_METADATA attempting internal generator.
CREATE VIEW MVIEW_WORKLOAD
ASCOMMENT ON TABLE MVIEW_WORKLOAD IS 'This view gives DBA access to shared workload'
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
--  DDL for Sequence BOOKING_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."BOOKING_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence BOOKING_SEQ1
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."BOOKING_SEQ1"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 321 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
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

   CREATE SEQUENCE  "SYSTEM"."ENROLLEDCOURSE_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
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

   CREATE SEQUENCE  "SYSTEM"."EVENTS_SEQ3"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 161 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
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

   CREATE SEQUENCE  "SYSTEM"."SESSIONMANAGEMENT_SEQ2"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 221 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence TABLE1_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."TABLE1_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
REM INSERTING into SYSTEM.COURSE
SET DEFINE OFF;
Insert into SYSTEM.COURSE (COURSEID,COURSENAME,COURSEFACULTY) values (21,'Bsc(hons) Robotic Engineering','Ajaya Lama');
Insert into SYSTEM.COURSE (COURSEID,COURSENAME,COURSEFACULTY) values (2,'Bsc (Hons) CS and  SE','Dr Swati Shah');
Insert into SYSTEM.COURSE (COURSEID,COURSENAME,COURSEFACULTY) values (3,'Bsc (Hons) BBA ','Ujwal Mani Sharma');
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