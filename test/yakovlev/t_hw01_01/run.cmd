@echo off

if not "%COMPILE_TARGET%" == "" goto gotCompileTarget
set COMPILE_TARGET=out

:gotCompileTarget
if not "%MAIN_CLASS%" == "" goto gotMainClass
set MAIN_CLASS=yakovlev.t_hw01_01.Test01_hw01_01

:gotMainClass
java -cp %COMPILE_TARGET% %MAIN_CLASS%
