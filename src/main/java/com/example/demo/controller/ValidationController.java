@RestController
 public class StudentController{
    @Autowired StudentService ser;

    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postData(stu);