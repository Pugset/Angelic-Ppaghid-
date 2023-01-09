import Student from "../models/Student.js"

export const getStudents = async (req, res) => {
    try {
        const students = await Student.find();
        if(students.length !== 0)
            res.status(200).json(students);
        else {
            res.status(204).send();
        }
    } catch (err) {
        res.status(500).json({error: err.message });
    }
}

export const getStudent = async (req, res) => {
    try {
        const { id } = req.params;
        const student = await Student.findById(id);
        if(student)
            res.status(200).json(student);
        else
            res.status(404).json({error: "Resource not found."});
    } catch (err) {
        res.status(500).json({error: err.message});
    }
}

export const addStudent = async (req, res) => {
    try {
        const {studentid, firstname, middlename, lastname} = req.body;
        const newStudent = await Student.create({
            studentid,
            firstname,
            middlename,
            lastname
        })
        const savedStudent = await newStudent.save();
        res.status(201).json({id: savedStudent._id});
    } catch (err) {
        res.status(500).json({error: err.message });
    }
}

export const deleteStudent = async (req, res) => {
    try {
        await Student.deleteOne({_id: req.params.id});
        res.status(204).send();
    } catch (err) {
        console.log(err);
        res.status(404).json({error: err.message});
    }
}

export const updateStudent = async (req, res) => {
    try {
        const filter = {_id: req.params.id};
        const {studentid, firstname, middlename, lastname} = req.body;
        const update = {
            studentid: studentid,
            firstname: firstname,
            middlename: middlename,
            lastname: lastname
        }

        await Student.findOneAndUpdate(filter, update);
        res.status(204).send();
    } catch (err) {
        res.status(404).json({error: err.message});
    }
}
