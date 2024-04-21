# Module347

[![Open in VS Code](https://img.shields.io/badge/Open%20in-VS%20Code-blue?logo=visual-studio-code)](https://vscode.dev/redirect?url=vscode://ms-vscode-remote.remote-containers/cloneInVolume?url=https://github.com/bbzbl-it-joku/Module347.git)

## Table of Contents

//TODO - Add table of contents

## Contributors

| Name | GitHub Account | Role |
|-----|-----|-----|
| Joshua Kunz | [@jokudev](https://github.com/jokudev) | __Project Lead & Main Dev__ |

## Requirements

As this Project has a Devcontainer, most requirements will be handled in the Container.

But to run this container, your development machine needs to have following requirements installed:

- [ ] [Docker](https://docs.docker.com/get-docker/)
- [ ] [Git](https://git-scm.com)
- [ ] [VS Code](https://code.visualstudio.com)
- [ ] [VS Code Devcontainer Extention](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers)

## Setup

Before we start make sure you have the [Requirements](#requirements) installed.

After that you can click the **Open in VS Code** Button at the top of the page.




Now you should have a local copy of the project

If it prompts you to trust the project and its authors please accept it.

Now you need to instll the Remote Developement extension

To launch it as a devcontainer you just need to click the blue Button in the bottom left corner again and navigate to "Reopen in Container"

Now it will take some time to launch. 

In the meanwhile you can look around the code and you will find the contents of the Project.

In short it contains a Mysql Database with the options to alter the Data with Phpmyadmin or with the ipynb (Jupyter Notebook). 

As soon as your devcontainer has completly started you can either go on phpmyadmin with localhot:8080 or use the ipynb to alter the Data.

If you chose the phpmyadmin route the username and password are "root"

If you instead use the Jupyter Notebook, you have to do one extra step. 
If you press "Run" next to the first code cell it will prompt you with an install request. You can click install and after that it should work.
If it doesnt work make sure you have a python kernel selected and have run the first cell before any other cells. 

# *Debug*

To debug the Jupyter Notebook code hover over the arrow next to the cell you want to debug. Click on the more arrow (looks like a v ) and click "Debug cell" otherwise you an click crtl + shift + alt + enter whilst in the cell you want to debug. You can see in which cell you are by the blue outline of the cell.

# *Connections*

*Jupyter notebook*
Selcet a Kernel at the top right. Go to Python enviroments and select the recomended one. 
Afterwards run the first cell. It will prompt you to install the jpynb kernel for the selected kernel. Click install. 
Now it will run the cells without problems.

*Mysql Container Shell*
Navigate to your Docker Desktop Applikation. Now find the mysql Container and navigate to the exec tab. Type "mysql -u root -p" and enter the password "root".

*PHP myadmin*
Connecto to "localhost:8080" with the password and username being "root"

