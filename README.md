CabSplit – End-to-End DevOps CI/CD Pipeline on AWS EKS
Project Overview

CabSplit is a Spring Boot–based application deployed on Amazon EKS using a complete DevOps pipeline. The project demonstrates Infrastructure as Code (Terraform), containerization (Docker), Continuous Integration (GitHub Actions), GitOps deployment (Argo CD), and Kubernetes monitoring using Prometheus and Grafana.

| Category               | Technology              |
| ---------------------- | ----------------------- |
| Cloud                  | AWS                     |
| Infrastructure as Code | Terraform               |
| Containerization       | Docker                  |
| Container Registry     | Amazon ECR              |
| Orchestration          | Kubernetes (Amazon EKS) |
| GitOps                 | Argo CD                 |
| CI                     | GitHub Actions          |
| Monitoring             | Prometheus, Grafana     |
| Application            | Spring Boot             |
| Version Control        | Git & GitHub            |

Project Architecture
Developer
      │
      ▼
GitHub Repository
      │
      ▼
GitHub Actions (CI)
      │
      ▼
Build Spring Boot Application
      │
      ▼
Build Docker Image
      │
      ▼
Push Image to Amazon ECR
      │
      ▼
Argo CD
      │
      ▼
Amazon EKS Cluster
      │
      ▼
CabSplit Application
      │
      ▼
Prometheus
      │
      ▼
Grafana Dashboards

Features
Automated CI pipeline using GitHub Actions
Dockerized Spring Boot application
Container images stored in Amazon ECR
GitOps deployment using Argo CD
Kubernetes deployment on Amazon EKS
LoadBalancer service for application access
Infrastructure provisioning using Terraform
Cluster monitoring using Prometheus
Dashboard visualization using Grafana
CI Pipeline

The Continuous Integration pipeline performs the following steps:

Trigger on Git push
Checkout source code
Configure Java environment
Build the application using Maven
Build Docker image
Push Docker image to Amazon ECR
CD Pipeline

The Continuous Deployment pipeline uses Argo CD.

Workflow:

Detect changes in Kubernetes manifests
Synchronize desired state with the EKS cluster
Deploy new application version
Maintain declarative Kubernetes configuration
Kubernetes Resources

The application is deployed using the following Kubernetes resources:

Namespace
Deployment
Service
ReplicaSet
Pods

Monitoring components:

Prometheus
Grafana
Alertmanager
Node Exporter
kube-state-metrics
Monitoring

The monitoring stack is deployed using the Prometheus Community Helm Chart.

Components:

Prometheus
Grafana
Alertmanager
kube-state-metrics
Node Exporter

Metrics collected:

Node CPU Utilization
Memory Utilization
Disk Utilization
Network Usage
Pod Health
Kubernetes Cluster Metrics

Deployment Steps
Provision AWS infrastructure using Terraform
Create Amazon EKS Cluster
Configure kubectl
Build and push Docker image to Amazon ECR
Deploy Argo CD
Create Argo CD Application
Deploy CabSplit to EKS
Install Prometheus and Grafana using Helm
Verify application health
Monitor Kubernetes cluster using Grafana dashboards

Learning Outcomes

Through this project, I gained hands-on experience with:

Infrastructure provisioning using Terraform
Kubernetes application deployment on Amazon EKS
CI/CD automation using GitHub Actions
GitOps deployment using Argo CD
Container image management with Amazon ECR
Kubernetes monitoring using Prometheus
Grafana dashboard creation and visualization
Kubernetes troubleshooting and resource management
