package test;

    @Rest
    public class ControllerDepartment {
        @Autowired

        private DepartmentService departmentService;

        @RequestMapping("/showDepartment")
        public String showDepartment() {
            String response = departmentService.getDepartmentName();
            return response;
        }
    }

