﻿


CREATE TABLE "public"."mnt" ("rid" serial PRIMARY KEY,"rast" raster,"filename" text);



SELECT AddRasterConstraints('public','mnt','rast',TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,FALSE,TRUE,TRUE,TRUE,TRUE,TRUE);