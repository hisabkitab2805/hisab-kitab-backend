# hisab-kitab-backend
Backend service of the hisab kitab application.

## How to run the service
### Setting up local db
1. Download and install mysql server (https://dev.mysql.com/downloads/installer/)
2. (Optional)Download and install mysql shell (https://dev.mysql.com/downloads/shell/)
3. Install Dbeaver (https://dbeaver.io/download/)
4. Test that the server is running by connecting to DB using either Shell or Dbeaver
5. (Optional) For connecting using shell you can run the following commands
```
\connect root@localhost:3306
```
6. Create a new database using the following command
```
CREATE DATABASE hisab_kitab
```
Note: While using shell you can change the mode from JS to SQL to avoid syntax error exception by running `\sql`
## How to contribute to this service
1. Make sure you are added as collaborator to the respository
2. Clone the repo in your local
```
git clone https://github.com/hisabkitab2805/hisab-kitab-backend.git
```
3. For any new feature create a new branch in local and make changes to that.
```
git checkout -b <feature_branch_name> main
```
4. Push the changes to origin on this new branch
```
git push origin <feature_branch_name>
```
5. Raise a merge request to main branch from github
