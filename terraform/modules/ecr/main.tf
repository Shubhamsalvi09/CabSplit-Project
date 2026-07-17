resource "aws_ecr_repository" "cabsplit" {
	name = "cabsplit"
	image_tag_mutability = "MUTABLE"

	image_scanning_configuration {
	scan_on_push = true
	}

	tags = {
		Name = "cabsplit-ecr"
		Environment = "dev"
	}
}
