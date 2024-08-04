

CREATE TABLE Students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    start_date DATE,
    end_date DATE
);

INSERT INTO Students (first_name, last_name, email, start_date, end_date) 
VALUES 
('John', 'Doe', 'john.doe@example.com', '2023-09-01', '2024-06-30'),
('Alice', 'Smith', 'alice.smith@example.com', '2023-09-01', '2024-06-30'),
('Bob', 'Johnson', 'bob.johnson@example.com', '2023-09-01', '2024-06-30');

CREATE TABLE Projects (
    project_id INT PRIMARY KEY AUTO_INCREMENT,
    course_id INT,
    project_name VARCHAR(100),
    project_description TEXT,
    materials TEXT,
    FOREIGN KEY (course_id) REFERENCES Courses(course_id)
);
INSERT INTO Projects (course_id, project_name, project_description, materials)
VALUES 
(1, 'Python Project 1', 'Create a simple Python application', 'https://example.com/python-project-materials'),
(2, 'Web Development Project 1', 'Design a basic website using HTML and CSS', 'https://example.com/web-project-materials'),
(3, 'Data Science Project 1', 'Analyze a dataset using Python libraries', 'https://example.com/data-science-project-materials');



CREATE TABLE Courses (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100),
    start_date DATE,
    end_date DATE
);

INSERT INTO Courses (course_name, start_date, end_date) 
VALUES 
('Python Programming', '2023-09-01', '2024-06-30'),
('Web Development', '2023-09-01', '2024-06-30'),
('Data Science', '2023-09-01', '2024-06-30');

CREATE TABLE Achievements (
    achievement_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    course_id INT,
    achievement_description TEXT,
    date_achieved DATE,
    FOREIGN KEY (student_id) REFERENCES Students(student_id),
    FOREIGN KEY (course_id) REFERENCES Courses(course_id)
);


INSERT INTO Achievements (student_id, course_id, achievement_description, date_achieved) 
VALUES 
(1, 1, 'Completed Python Programming course with distinction', '2024-06-30'),
(2, 2, 'Received certificate for Web Development course', '2024-06-30'),
(3, 3, 'Achieved top grade in Data Science project', '2024-06-30');

CREATE TABLE Grades (
    grade_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    course_id INT,
    project_name VARCHAR(100),
    grade INT,
    reviewer_id INT,
    date_graded DATE,
    review_notes TEXT,
    FOREIGN KEY (student_id) REFERENCES Students(student_id),
    FOREIGN KEY (course_id) REFERENCES Courses(course_id),
    FOREIGN KEY (reviewer_id) REFERENCES Students(student_id)
);

INSERT INTO Grades (student_id, course_id, project_name, grade, reviewer_id, date_graded, review_notes) 
VALUES 
(1, 1, 'Python Project 1', 85, 2, '2024-05-10', 'Good job overall, but could improve documentation'),
(2, 2, 'Web Development Project 2', 92, 3, '2024-05-11', 'Excellent work, well done!'),
(3, 3, 'Data Science Project 1', 78, 1, '2024-05-12', 'Some errors in data analysis section, but good effort overall');


SELECT * FROM Students;

SELECT * FROM Courses;

SELECT * FROM Achievements;

SELECT * FROM Grades;

UPDATE Grades
SET grade = 90, review_notes = 'Well done!'
WHERE project_name = 'Python Project 1';

UPDATE Grades
SET grade = 95, review_notes = 'Excellent work!'
WHERE student_id = 2 AND course_id = 2;


DELETE FROM Grades
WHERE student_id = 1;


DELETE FROM Grades
WHERE student_id = 3


SELECT c.course_name, p.project_name, p.project_description, p.materials
FROM Courses c
JOIN Projects p ON c.course_id = p.course_id;

SELECT *
FROM Projects;

SELECT s.first_name, s.last_name, c.course_name, p.project_name, a.grade, a.date_achieved
FROM Achievements a
JOIN Students s ON a.student_id = s.student_id
JOIN Courses c ON a.course_id = c.course_id
JOIN Projects p ON a.project_id = p.project_id;

SELECT s.student_id, s.first_name, s.last_name,
    CASE
        WHEN AVG(a.grade) > 60 THEN 'zaawansowany'
        ELSE 'uznany za zaawansowanego'
    END AS achievement_level
FROM Achievements a
JOIN Students s ON a.student_id = s.student_id
GROUP BY s.student_id;

SELECT s.first_name, s.last_name, SUM(a.grade) AS total_score
FROM Achievements a
JOIN Students s ON a.student_id = s.student_id
GROUP BY s.student_id
ORDER BY total_score DESC
LIMIT 3;











