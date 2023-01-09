import express from 'express';
import {getStudent, getStudents, addStudent, 
    deleteStudent, updateStudent} from '../controllers/students.js'
import { verifyToken } from '../middleware/auth.js';

const router = express.Router();

router.get('/', verifyToken, getStudents);
router.get('/:id', verifyToken, getStudent);
router.post('/', verifyToken, addStudent);
router.put('/:id', verifyToken, updateStudent);
router.delete('/:id', verifyToken, deleteStudent);

export default router;
