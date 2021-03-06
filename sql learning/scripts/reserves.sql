--------------------------------------------------------
--  File created - Thursday-June-18-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table RESERVES
--------------------------------------------------------

  CREATE TABLE "HARI_ORACLE"."RESERVES" 
   (	"SID" NUMBER(*,0), 
	"BID" NUMBER(*,0), 
	"DAY" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_RESERVES
--------------------------------------------------------

  CREATE UNIQUE INDEX "HARI_ORACLE"."PK_RESERVES" ON "HARI_ORACLE"."RESERVES" ("SID", "BID", "DAY") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table RESERVES
--------------------------------------------------------

  ALTER TABLE "HARI_ORACLE"."RESERVES" ADD CONSTRAINT "PK_RESERVES" PRIMARY KEY ("SID", "BID", "DAY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "HARI_ORACLE"."RESERVES" MODIFY ("DAY" NOT NULL ENABLE);
  ALTER TABLE "HARI_ORACLE"."RESERVES" MODIFY ("BID" NOT NULL ENABLE);
  ALTER TABLE "HARI_ORACLE"."RESERVES" MODIFY ("SID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table RESERVES
--------------------------------------------------------

  ALTER TABLE "HARI_ORACLE"."RESERVES" ADD FOREIGN KEY ("SID")
	  REFERENCES "HARI_ORACLE"."SAILORS" ("SID") ENABLE;
  ALTER TABLE "HARI_ORACLE"."RESERVES" ADD FOREIGN KEY ("BID")
	  REFERENCES "HARI_ORACLE"."BOATS" ("BID") ENABLE;
