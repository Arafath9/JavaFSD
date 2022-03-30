package com.simplilearn.demo;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.PrintWriter;
public class FileHandling {
public static void main(String[] args) {
char ch;
try {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a word to write w to read r and to append a");
ch=sc.next().charAt(0);
switch(ch) {
case 'w':
{
System.out.println("Enter a text to be written to a file");
sc.nextLine();
String text=sc.nextLine();
FileWriter fWriter = new FileWriter("C:\\Demo\\New folder\\TextDocument.txt");
fWriter.write(text);
fWriter.close();
System.out.println("File with data given has been written successfully");
break;
}
case 'r':
{
FileReader fr=new FileReader("C:\\Demo\\New folder\\TextDocument.txt");
int i;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
break;
}
case 'a':
{
PrintWriter pw=new PrintWriter("C:\\Demo\\New folder\\TextDocument.txt");
pw.append('s');
System.out.println("file AFTER APPENDED");
pw.flush();
break;
}
default:
System.out.println("Invalid character");
break;
}
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}
}