-- array_processing.adb creates, modifies, and prints an Array
-- Lorrayya Willimas
-- Created on March 11, 2019 for CS 214 at Calvin College
---------------------------------------------------------------
 
with Ada.Text_IO; use Ada.Text_IO;             -- Put(String)
with Ada.Float_Text_IO; use Ada.Float_Text_IO; -- Put(Float)
with Ada.Text_IO, Ada.Integer_Text_IO;
use  Ada.Text_IO, Ada.Integer_Text_IO;
with Ada.Numerics.Elementary_Functions;
use Ada.Numerics.Elementary_Functions;


procedure array_processing is
	--intializes the variables size
	size : Natural;
	type anArray is array (Positive range <>) of Float;


----------------------------------------------
-- printArray() prints the values in an Array    -
-- Receive: theArray     -
-- Return: the values of the Array by printing -
----------------------------------------------
procedure printArray (theArray : in anArray) is
	begin
	for a in theArray'Range loop
		Put(theArray(a));
		New_line;
	end loop;

end printArray;

----------------------------------------------
-- readArray() reads in values and adds them to an arrau-
-- Receive: anArray, size   -
-- Return: the modified array -
----------------------------------------------
procedure readArray(theArray : in out  anArray; size : in Natural) is
begin
	for a in  1..size loop
	Put("Add a value: ");
	Get(theArray(a));
	New_line;	
	end loop;
end readArray;



begin
	Put("Welcome! This array_processing allows you to create an array and add values.");
	New_line;
	Put("What size array would you like? ");
	Get(size);
	declare
	theArray: anArray(1 .. size);
	begin
	readArray(theArray, size);
	printArray(theArray);
	end;

end array_processing;