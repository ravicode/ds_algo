package Theory_questions;

/*what happens when a CPU is powered, how bootstrap works and interrupt vectors.*/

/*
 When your PC is powered on a sequence called the bootstrap is run. It occurs in two steps, 
 Power-On Self Test and Operating System Load. 

 Power-On Self Test  (POST) is a series of tests to make certain that necessary is present and properly
  operating. 

 1.First the Central Processing Unit (CPU) is reset. 


 2.The CPU checks itself and the POST program stored in the BIOS memory. 


 3.Then the CPU begins using the code located in BIOS to check components in the PC. 


 4.The DRAM is tested by writing and reading back every byte to insure proper operation. 


 5.The Keyboard is checked for attachment and to see if any key has been pressed. 


 6.Pushing certain keys during boot up tells the CPU you want to modify the BIOS code. 
 You would want to do this if a new piece of hardware has been added and you need to set 
 up BIOS to talk to it. 


 7.The Floppy and Hard Drives are checked to make sure they are present. 


 8.The Mouse is also checked to make sure it is attached. 


 9.Finally, the test results are compared to the configuration data in the BIOS. 


 10.Any mismatches causes the POST to fail and an error message appears on the display. 

 Operating System Load  - After the POST is successfully completed the CPU searches Storage devices for special files that indicate the beginning of the OS and then loads it into memory. 

 1.The sequence in which the storage devices are searched is part of the configuration set-up stored in BIOS. 


 2.Once the Operating System (OS) is located, the CPU copies what�s called the 'boot record' from the OS into DRAM. 


 3.Control is then passed to the 'boot record' in DRAM, which then continues loading the rest of the OS. 


 4.This process continues until the OS load is completed. 


 5.When the OS load is completed the Desktop appears in the display and waits for you, the user, to tell it what you want it to do. 

 */

/*The following is a summary of the boot process in a PC:
 1.The power button activates the power supply in the PC, sending power to the motherboard and other components.
 2.The PC performs a power-on self-test (POST). The POST is a small computer program within the BIOS that checks for hardware failures. A single beep after the POST signals that everything's okay. Other beep sequences signal a hardware failure, and PC repair specialists compare these sequences with a chart to determine which component has failed.
 3.The PC displays information on the attached monitor showing details about the boot process. These include the BIOS manufacturer and revision, processor specs, the amount of RAM installed, and the drives detected. Many PCs have replaced displaying this information with a splash screen showing the manufacturer's logo. You can turn off the splash screen in the BIOS settings if you'd rather see the text.
 4.The BIOS attempts to access the first sector of the drive designated as the boot disk. The first sector is the first kilobytes of the disk in sequence, if the drive is read sequentially starting with the first available storage address. The boot disk is typically the same hard disk or solid-state drive that contains your operating system. You can change the boot disk by configuring the BIOS or interrupting the boot process with a key sequence (often indicated on the boot screens).
 5.The BIOS confirms there's a bootstrap loader, or boot loader, in that first sector of the boot disk, and it loads that boot loader into memory (RAM). The boot loader is a small program designed to find and launch the PC's operating system.
 6.Once the boot loader is in memory, the BIOS hands over its work to the boot loader, which in turn begins loading the operating system into memory.
 7.When the boot loader finishes its task, it turns control of the PC over to the operating system. Then, the OS is ready for user interaction.
 */
public class WhatHappensWhenCPUstarts {

}
