Keyboard-Warrior
-------------------
A Keyboard shortcut program for expanding user defined code and text blocks. 

System Requirements
-------------------

  * JDK:
    * 1.7 or above (this is to execute Maven - it still allows you to build against 1.3
    * and prior JDK's).
  * Memory:
    * No minimum requirement.
  * Disk:
    * Approximately 10MB is required for the Maven installation itself. In addition to
    * that, additional disk space will be used for your local Maven repository. The size
    * of your local repository will vary depending on usage but expect at least 500MB.
  * Operating System:
    * Windows:
      * Windows 10 or above.
    * Unix based systems (Linux, Solaris and Mac OS X) and others:
      * No minimum requirement.

  Installing Maven
  ----------------

  1) Unpack the archive where you would like to store the binaries, e.g.:

    Unix-based operating systems (Linux, Solaris and Mac OS X)
      tar zxvf apache-maven-3.x.y.tar.gz
    Windows
      unzip apache-maven-3.x.y.zip

  2) A directory called "apache-maven-3.x.y" will be created.

  3) Add the bin directory to your PATH, e.g.:

    Unix-based operating systems (Linux, Solaris and Mac OS X)
      export PATH=/usr/local/apache-maven-3.x.y/bin:$PATH
    Windows
      set PATH="c:\program files\apache-maven-3.x.y\bin";%PATH%

  4) Make sure JAVA_HOME is set to the location of your JDK

  5) Run "mvn --version" to verify that it is correctly installed.

For complete documentation, see https://maven.apache.org/download.html#Installation
End with an example of getting some data out of the system or using it for a little demo


Built With
-------------------
* [Maven](https://maven.apache.org/) - Dependency Management


Authors
-------------------
* **Josh Poe** - [icarus44-zer0]https://github.com/icarus44-zer0
* **Daniel Olsen** - [boomthegoat]https://github.com/boomthegoat
* **Oscar Vaquera** - [vaqueraoscar0]https://github.com/vaqueraoscar0
* **Viktoriya Penkova** -[viktoriya-2]https://github.com/viktoriya-2

License
-------------------
Keyboard-Warrior is covered under the [GNU General Public](https://www.gnu.org/licenses/gpl-3.0.txt) *and* the
[Apache License](https://www.apache.org/licenses/LICENSE-2.0)

Acknowledgments
-------------------
* [OneGneissGuy](https://github.com/OneGneissGuy)
* [kwhat](https://github.com/kwhat/jnativehook)
* [kiranshastry](https://www.flaticon.com/authors/kiranshastry)
* [GNU General Public License](https://www.gnu.org/licenses/gpl-3.0.en.html)
