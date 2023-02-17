package TC;
    public class Project {
        private int projectID;
        private String projectName;
        private ProjectManager manager;
        private boolean isFinished;
        private int numberOfWorker;
    
        public Project(int ID, String projectName) {
            super();
            this.projectID = ID;
            this.projectName = projectName;
            this.isFinished = false;
        }
    
        public Project(int ID, String projectName, ProjectManager manager, boolean isFinished, int numberOfWorker) {
            this.projectID = ID;
            this.projectName = projectName;
            this.isFinished = isFinished;
            this.manager = manager;
            this.numberOfWorker = numberOfWorker;
        }
    
        public int getID() { return this.projectID; }
        
        public String getProjectName() { return this.projectName; }
    
        public ProjectManager getManager() { return this.manager; }
    
        public int getNumberOfWorker() { return this.numberOfWorker; }
    
        public void setID(int id) { this.projectID = id; }
    
        public void setProjectName(String name) { this.projectName = name; }
    
        public void setManager(ProjectManager manager) { 
            if (this.manager != null) this.manager.currentProject = null; // Dam bao 1 project chi co 1 manager
            this.manager = manager; 
        }
    
        public void setNumberOfWorker(int number) { this.numberOfWorker = number; }
    
        public void setFinished() { 
            this.isFinished = true; 
            this.manager = null;
            this.numberOfWorker = 0;
        }
    
        public void printStatus() {
            System.out.println("==== Project #" + projectID + " ====");
            System.out.println("Project name: " + projectName);
            if (isFinished) System.out.println("Status: Completed");
            else {
                System.out.println("Status: In progress");
            }
            if (manager != null) System.out.println("Managed by: " + manager.fullName);
            if (numberOfWorker > 0) System.out.println("Current number of workers: " + numberOfWorker);
        }
    
        public String toString() {
            return "Project[id: " + projectID + ", name: " + projectName + ", isFinished: " + isFinished + "]";
        }
    
    }
    

