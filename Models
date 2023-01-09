import mongoose from "mongoose";
import { serializeInteger } from "whatwg-url";

const StudentSchema = new mongoose.Schema(
    {
        studentid: {type: String, required: true},
        firstname: {type: String, required: true},
        middlename: {type: String, required: false},
        lastname: {type: String, required: true},
    },
    { timestamps: true}
);

const Student = mongoose.model('Student', StudentSchema);
export default Student;
