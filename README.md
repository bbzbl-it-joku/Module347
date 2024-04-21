# Module347

[![Open in VS Code](https://img.shields.io/badge/Open%20in-VS%20Code-blue?logo=visual-studio-code)](https://vscode.dev/redirect?url=vscode://vscode.git/clone?url=https://github.com/bbzbl-it-joku/Module347.git)

## Table of Contents

- [Module347](#module347)
  - [Table of Contents](#table-of-contents)
  - [Contributors](#contributors)
  - [Requirements](#requirements)
  - [Setup](#setup)
  - [Contribution](#contribution)
  - [License](#license)

## Contributors

| Name | GitHub Account | Role |
|------|----------------|------|
| Joshua Kunz | [@jokudev](https://github.com/jokudev) | Project Lead & Main Dev |

## Requirements

As this project uses a devcontainer, most requirements will be handled within the container.

To run this container, your development machine needs the following installed:

- [Docker](https://docs.docker.com/get-docker/)
- [Git](https://git-scm.com)
- [VS Code](https://code.visualstudio.com)
- [VS Code Devcontainer Extension](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers)

## Setup

0. Before we start, make sure you have the [requirements](#requirements) installed.

1. Click the __Open in VS Code__ button at the top of the page.

2. VS Code should open locally on your computer.

3. Clone the repository locally onto your computer.

4. Install the Remote Development extension.

5. To launch it as a devcontainer, click the blue button in the bottom left corner and navigate to "Reopen in Container."

6. The launch of the container may take up to 60-80 seconds, depending on the Maven dependencies.

7. Once the launch of the container is complete, copy the `.env.sample` file to `.env` and update the variables.

8. Go to the "Run and Debug" panel on the left side or press ___F5___.

9. Open [http://localhost:9090](http://localhost:9090) to access the Swagger UI.

## Contribution

We welcome contributions to the project! Here's how you can get involved:

- __Fork the repository:__ Start by forking the repository to your GitHub account.
- __Create a new branch:__ Create a new branch for your changes and make sure to follow a naming convention such as `feature/your-feature` or `bugfix/your-bug`.
- __Make your changes:__ Implement your changes and write tests if necessary.
- __Commit and push:__ Commit your changes with descriptive commit messages and push your branch to GitHub.
- __Open a pull request:__ Once your changes are ready, open a pull request for review. Describe your changes and any potential issues.
- __Code reviews:__ Participate in code reviews and provide constructive feedback to other contributors.

We follow a code of conduct to ensure a welcoming and inclusive environment for everyone. Please adhere to it when contributing.

## License

This project is licensed under the [GNU General Public License v3.0](https://www.gnu.org/licenses/gpl-3.0.en.html). You are free to use, modify, and distribute this project, provided that any distributed versions or derivatives are also licensed under the GPLv3.

For more details about the license, please refer to the [local license file](LICENSE).
