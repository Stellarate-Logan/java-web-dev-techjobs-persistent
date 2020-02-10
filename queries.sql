##Part 1
EXPLAIN techjobs.job;
DESCRIBE techjobs.job;
SHOW FIELDS FROM techjobs.job;
SHOW COLUMNS FROM techjobs.job;
##Part2
SELECT name, location
FROM employer
WHERE location
IN (SELECT location FROM employer WHERE location="St. Louis City");

#Part3

##Part4
SELECT name, description FROM techjobs.skill WHERE id in(SELECT skills_id FROM job_skills WHERE skills_id IS NOT NULL);